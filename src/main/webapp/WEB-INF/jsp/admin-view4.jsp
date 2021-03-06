<!DOCTYPE html>
<html lang="en" ng-app="loop">
<head>
<title>LOOP | Admin - Blocked Accounts</title>
    <link href="img/favicon.ico" type="image/x-icon" rel="shortcut icon" />
    <link href="css/bootstrap3/dist/css/bootstrap.css" rel="stylesheet" media="screen" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/bootstrapformhelpers/css/bootstrap-formhelpers.css" rel="stylesheet" />
    <link href="css/bootstrap-modal-master/css/bootstrap-modal.css" rel="stylesheet" />
    <link href="fonts/font-awesome/css/font-awesome.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="css/datatables/css/dataTables.bootstrap.css" />
    <link href="js/bootstrap-tour/build/css/bootstrap-tour.css" rel="stylesheet" />
    <link href="js/bootstrap-tour/build/css/bootstrap-tour.min.css" rel="stylesheet" />
    <link type="text/css" href="css/css-include/style-footer-try.css" rel="stylesheet" />
    <link type="text/css" href="css/inputfile/jquery.inputfile.css" rel="stylesheet" />
    <script type="text/javascript">
        function selectIndex(v){
                document.getElementById("selectedIndex").value=v;
        }
    </script>
</head>
<body>	
    <jsp:include page="include/CurrentUser.jsp"/>
		<div class="clearfix"></div>
        <form method="post" ng-controller="blockCtrl" id="unblockForm" name="unblockForm">
            <div class="modal fade" id="responsive_fileActionAdmin4" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header light-theme">	
                            <button type="button" class="close light-theme" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <span class="popup">User Action</span>
                        </div>
                        <div class="modal-body">  
                            <div class="row">
                                <div class="col-md-10 col-md-push-1">                                 
                                    <label class="file-action">What would you like to do with this Blocked account?</label>
                                </div> 
                            </div>
                        </div>
                        <div class="modal-footer"> 
                            <div class="row">
                                <div class="col-md-9 col-md-push-2">
                                	<button type="button" class="btn btn-primary" ng-click="unblockMe()"><i class="icon-check icon-large default"></i> Unblock Account</button>
								    <button type="button" data-dismiss="modal" class="btn btn-default"></i> Cancel</button>
									<input type="hidden" id="selectedIndex" name="index" value="0"/>      
									<input type="hidden" name="a" id="a" value="1" />
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    	<ul class="nav nav-tabs main-views">
    		<li><a href="/loop-XYZ/store/admin-view"><i class="icon-plus-sign-alt icon-large default"></i> New Account Requests</a></li>
		<li><a class="active-tab" href="/loop-XYZ/store/admin-view1"><i class="icon-folder-open icon-large default"></i> Developers</a></li>
                <li><a href="/loop-XYZ/store/admin-view2"><i class="icon-edit icon-large default"></i> Reviewers</a></li>
		<li><a href="/loop-XYZ/store/admin-view3"><i class="icon-time icon-large default"></i> Inactive Accounts</a></li>
		<li class="active"><a href="/loop-XYZ/store/admin-view4"><i class="icon-ban-circle icon-large default"></i> Blocked Accounts</a></li>
		<li><a href="/loop-XYZ/store/admin-view5"><i class="icomoon-list"></i> Learning Objects</a></li>
		<li><a href="/loop-XYZ/store/admin-view6"><i class="icomoon-list"></i> Learning Elements</a></li>
		</ul>
		<div class="clearfix"></div>
  		<div id="content-wrap-rev" ng-controller="blockCtrl">
			<div class="container">
				<div class="row">
					<div class="col-md-12 content">	
                                            <div class="table-responsive" ng-controller="blockedAccountCtrl">
                                                        <div id="DataTables_Table_0_wrapper" class="dataTables_wrapper form-inline" role="grid">
                                                            <div class="row">
                                                                <div class="col-sm-12">
                                                                <div class="pull-right">
                                                                    <i class="icomoon-search pull-left searchbar-icon"></i>
                                                                    <div class="dataTables_filter pull-right" id="DataTables_Table_0_filter">
                                                                        <label>
                                                                            <input type="text" aria-controls="DataTables_Table_0" data-ng-model="searchText" placeholder="Search" class="form-control input-sm" style="width: 162px;">
                                                                        </label>
                                                                    </div>
                                                                </div>
                                                                    <div class="clearfix"></div>
                                                                </div>
                                                            </div>
							<table class="datatable table table-hover">
							    <thead>
									<tr>
										<th>Username</th>
										<th>Last Login</th>
										<th>Account Type</th>
										
									</tr>
								</thead>

						        <tbody>
                                                            <tr ng-repeat="blocked in blockedAccount | filter:searchText">
                                                                    <td><a href="#responsive_fileActionAdmin4" data-toggle="modal" onclick="selectIndex('.$counter.')"><label ng-click="assignUser(blocked)" value="blocked.username" ng-model="blocked.username">{{blocked.username}}</a></td>
                                                                    <td><label ng-model="blocked.lastLogin">{{blocked.lastLogin}}</td>
                                                                    <td><label ng-model="blocked.usertype">{{blocked.usertype}}</td>
                                                             </tr>							
							</tbody>
							  </table>
						</div>

					</div>
				</div>
				<div class="clearfix" id="before-features" ></div>
			</div>
		</div>
  		<div class="clearfix"></div>
        <div class="push"></div>
	</div>
	<div class="footer">
		<footer id="footer-wrap-index">
			<div class="container">
	            <div class="copyright-here pull-left">
					Copyright &copy; LOOP | Learning Object Organizer Plus. All rights reserved.<!-- <button id="aime" class="btn btn-default">Test</button> -->
		    	</div>
		    </div>
	    </footer>
    </div>
	<!-- Load JS here for greater good =============================-->
	<script src="js/js-flat-ui/jquery-1.8.3.min.js"></script>
	<script src="js/js-flat-ui/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="js/js-flat-ui/jquery.ui.touch-punch.min.js"></script>
	<script src="js/js-flat-ui/flatui-checkbox.js"></script>
	<script src="js/js-flat-ui/flatui-radio.js"></script>
	<script src="js/js-flat-ui/jquery.tagsinput.js"></script>
	<script src="js/js-flat-ui/jquery.placeholder.js"></script>
	<script src="js/js-flat-ui/jquery.stacktable.js"></script>
	<script src="js/datatables/jquery.dataTables.min.js"></script>
	<script src="js/datatables/dataTables.bootstrap.js"></script>        
	<script src="js/backstretch-jquery/jquery.backstretch.min.js"></script>
	<script src="js/datatables/jquery.dataTables.min.js"></script>            
	<script src="js/datatables/dataTables.bootstrap.js"></script>
        <script src="js/main.js"></script>
	<script src="css/bootstrap3/js/tooltip.js"></script>
	<script src="css/bootstrap3/js/popover.js"></script>
	<script src="css/bootstrap3/dist/js/bootstrap.js"></script>

        <script src="js/angular/angular.js"></script>
        <script src="js/angular/ngStorage.js"></script>
        <script src="js/loop.js" type="text/javascript"></script>
	<script src="js/bootstrap-tour/build/js/bootstrap-tour.js"></script>
	<script src="js/bootstrap-tour/build/js/bootstrap-tour.min.js"></script>
	<script type="text/javascript" src="js/bootstrapvalidator/dist/js/bootstrapValidator.js"></script>
	<script>
	$("#banner-wrap").backstretch("img/img-banner.jpg");
	</script>
	<script type="text/javascript">
		$(document).ready(function() {
		    $('#defaultForm').bootstrapValidator({
		        message: 'This value is not valid',
		        submitHandler: function(validator, form) {
                        form.find('.alert').html('Password Changed.').show();
	            },
		        fields: {
		            username: {
		                message: 'The username is not valid',
		                validators: {
		                    notEmpty: {
		                        message: 'The username is required and can\'t be empty'
		                    },
		                    stringLength: {
		                        min: 6,
		                        max: 30,
		                        message: 'The username must be more than 6 and less than 30 characters long'
		                    },
		                    regexp: {
		                        regexp: /^[a-zA-Z0-9_\.]+$/,
		                        message: 'The username can only consist of alphabetical, number, dot and underscore'
		                    }
		                }
		            },
		            email: {
		                validators: {
		                    notEmpty: {
		                        message: 'The email address is required and can\'t be empty'
		                    },
		                    emailAddress: {
		                        message: 'The input is not a valid email address'
		                    }
		                }
		            },
		            newPassword: {
		                validators: {
		                    notEmpty: {
		                        message: 'The password is required and can\'t be empty'
		                    },
		                    identical: {
		                        field: 'confirmNewPassword',
		                        message: 'The password and its confirm are not the same'
		                    }
		                }
		            },
		            confirmNewPassword: {
		                validators: {
		                    notEmpty: {
		                        message: 'The confirm password is required and can\'t be empty'
		                    },
		                    identical: {
		                        field: 'newPassword',
		                        message: 'The password and its confirm are not the same'
		                    }
		                }
		            }
		        }
		    });
		});
	</script>

</body>
</html>
