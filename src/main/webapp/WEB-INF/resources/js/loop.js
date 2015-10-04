/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global angular */

var eS = angular.module('loop', ['localStorage']);
eS.controller('LoginCtrl', ['$scope', '$store', function($scope, $store) {
    $store.bind($scope, 'username', '');
    $store.bind($scope, 'userId', '');
    $scope.$watch("username", function(newVal) {
        console.log(newVal);
    });
    $scope.hide = true;
    $scope.clearUser = function(){ 
        $store.remove('username'); 
        $store.remove('userId');
    };
}]);

eS.controller('LOList', ['$scope', '$http', function($scope, $http) {
    $http.get("/loop-XYZ/loop/LO/list")    
    .success(function(data) {
    	$scope.los = data;
        //console.log(""+ response);
    	//$scope.filename = data.filename;
        //console.log("" + response);
    })
    .error(function(jqXHR, status, error) {
    	//$scope.tasks = response.taskList;
        console.log(""+ error);
        //console.log("" + response);
    });
}]);

eS.controller('DisplayLOCtrl', ['$scope', '$http', function($scope, $http) {
    $http.get("/loop-XYZ/loop/LO/download")    
    .success(function(data) {
    	$scope.filename = 'response.taskList';
        //console.log(""+ response);
    	//$scope.filename = data.filename;
        //console.log("" + response);
    })
    .error(function(jqXHR, status, error) {
    	//$scope.tasks = response.taskList;
        console.log(""+ error);
        //console.log("" + response);
    });
}]);
    
eS.controller('newAccountRequestCtrl', ['$scope', '$http', function($scope, $http) {
    $http.get("/loop-XYZ/loop/user/newAccountRequests")    
    .success(function(data) {
    	$scope.userAccount = data;
    })
    .error(function(jqXHR, status, error) {
    	//$scope.tasks = response.taskList;
        console.log(""+ error);
        //console.log("" + response);
    });
}]);
        /**
    HttpClient httpclient = new DefaultHttpClient();
    HttpResponse response = httpClient.execute(new HttpGet(URL));
    HttpEntity entity = response.getEntity();
    String responseString = EntityUtils.toString(entity, "UTF-8");
    System.out.println(responseString);
    	**/

eS.controller('developerAccountCtrl', ['$scope', '$http', function($scope, $http) {
    $http.get("/loop-XYZ/loop/user/developer")    
    .success(function(data) {
    	$scope.developerAccount = data;
    })
    .error(function(jqXHR, status, error) {
    	//$scope.tasks = response.taskList;
        console.log(""+ error);
        //console.log("" + response);
    });
}]);

eS.controller('reviewerAccountCtrl', ['$scope', '$http', function($scope, $http) {
    $http.get("/loop-XYZ/loop/user/reviewer")    
    .success(function(data) {
    	$scope.reviewerAccount = data;
    })
    .error(function(jqXHR, status, error) {
        console.log(""+ error);
    });
}]);

eS.controller('inactiveAccountCtrl', ['$scope', '$http', function($scope, $http) {
    $http.get("/loop-XYZ/loop/user/inactive")    
    .success(function(data) {
    	$scope.inactiveAccount = data;
        //console.log(""+ response);
    	//$scope.filename = data.filename;
        //console.log("" + response);
    })
    .error(function(jqXHR, status, error) {
    	//$scope.tasks = response.taskList;
        console.log(""+ error);
        //console.log("" + response);
    });
}]);

eS.controller('blockedAccountCtrl', ['$scope', '$http', function($scope, $http) {
    $http.get("/loop-XYZ/loop/user/block")    
    .success(function(data) {
    	$scope.blockedAccount = data;
        //console.log(""+ response);
    	//$scope.filename = data.filename;
        //console.log("" + response);
    })
    .error(function(jqXHR, status, error) {
    	//$scope.tasks = response.taskList;
        console.log(""+ error);
        //console.log("" + response);
    });
}]);

eS.controller('LEListCtrl', ['$scope', '$http', function($scope, $http) {
    $http.get("/loop-XYZ/loop/LE/list")    
    .success(function(data) {
    	$scope.les = data;
    })
    .error(function(jqXHR, status, error) {
        console.log(""+ error);
    });
}]);




var ls = angular.module('localStorage',[]);
 
ls.factory("$store",function($parse){
	/**
	 * Global Vars
	 */
	var storage = (typeof window.localStorage === 'undefined') ? undefined : window.localStorage,
		supported = !(typeof storage == 'undefined' || typeof window.JSON == 'undefined');

	var privateMethods = {
		/**
		 * Pass any type of a string from the localStorage to be parsed so it returns a usable version (like an Object)
		 * @param res - a string that will be parsed for type
		 * @returns {*} - whatever the real type of stored value was
		 */
		parseValue: function(res) {
			var val;
			try {
				val = JSON.parse(res);
				if (typeof val == 'undefined'){
					val = res;
				}
				if (val == 'true'){
					val = true;
				}
				if (val == 'false'){
					val = false;
				}
				if (parseFloat(val) == val && !angular.isObject(val) ){
					val = parseFloat(val);
				}
			} catch(e){
				val = res;
			}
			return val;
		}
	};
	var publicMethods = {
		/**
		 * Set - let's you set a new localStorage key pair set
		 * @param key - a string that will be used as the accessor for the pair
		 * @param value - the value of the localStorage item
		 * @returns {*} - will return whatever it is you've stored in the local storage
		 */
		set: function(key,value){
			if (!supported){
				try {
					$.cookie(key, value);
					return value;
				} catch(e){
					console.log('Local Storage not supported, make sure you have the $.cookie supported.');
				}
			}
			var saver = JSON.stringify(value);
			 storage.setItem(key, saver);
			return privateMethods.parseValue(saver);
		},
		/**
		 * Get - let's you get the value of any pair you've stored
		 * @param key - the string that you set as accessor for the pair
		 * @returns {*} - Object,String,Float,Boolean depending on what you stored
		 */
		get: function(key){
			if (!supported){
				try {
					return privateMethods.parseValue($.cookie(key));
				} catch(e){
					return null;
				}
			}
			var item = storage.getItem(key);
			return privateMethods.parseValue(item);
		},
		/**
		 * Remove - let's you nuke a value from localStorage
		 * @param key - the accessor value
		 * @returns {boolean} - if everything went as planned
		 */
		remove: function(key) {
			if (!supported){
				try {
					$.cookie(key, null);
					return true;
				} catch(e){
					return false;
				}
			}
			storage.removeItem(key);
			return true;
		},
		/**
	         * Bind - let's you directly bind a localStorage value to a $scope variable
	         * @param $scope - the current scope you want the variable available in
	         * @param key - the name of the variable you are binding
	         * @param def - the default value (OPTIONAL)
	         * @returns {*} - returns whatever the stored value is
	         */
	        bind: function ($scope, key, def) {
	            def = def || '';
	            if (!publicMethods.get(key)) {
	                publicMethods.set(key, def);
	            }
	            $parse(key).assign($scope, publicMethods.get(key));
	            $scope.$watch(key, function (val) {
	                publicMethods.set(key, val);
	            }, true);
	            return publicMethods.get(key);
	        }
	};
	return publicMethods;
});
