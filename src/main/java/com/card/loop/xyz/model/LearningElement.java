/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.card.loop.xyz.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * @author aislinn 
 */
@Document(collection = "le.meta.files")
public class LearningElement {
    
    /*
    *id of learning element
    */
    @Id
    private String id;
    /*
    *title of learning element
    */
    private String title;
    /*
    *subject of learning element
    */
    private String subject;
    /*
    *description of learning element
    */
    private String description;
    /*
    *number of downloads of learning element
    */
    private int downloads;
    /*
    *uploadDate of learning element
    */
    private String uploadDate;
    /*
    *filepath of learning element
    */
    private String filepath;
    /*
    *rating of learning element
    */
    private double rating;
    /*
    *comments of learning element
    */
    private String comments;
    /*
    *status of learning element
    */
    private String status;
    /*
    *reviewer of learning element
    */
    private String rev;
    /*
    *uploaded the learning element
    */
    private String uploadedBy;
    /*
    *Type of the Learning Object.
    *Example: music, video, text, etc.
    */
    private String type;
    
    private String fileExtension;
    
    private String fileName;
    
    
  
    /**
     * Gets the id of the learning element
     * @return Long This returns the id of the learning element
     */
    public String getId(){
        return this.id;
    }
    /**
     * Sets the id of the learning element
     * @param id 
     */
    public void setId(String id){
       this.id=id;
    }
    /**
     * Gets the title of the learning element
     * @return String This returns the title of the learning element 
     */
    public String getTitle(){
        return this.title;
    }
    /**
     * Sets the title of the learning element
     * @param title 
     */
    public void setTitle(String title){
        this.title=title;
    }
    /**
     * Gets the subject of the learning the learning element
     * @return String This returns the subject of the learning element     
     */
    public String getSubject(){
        return this.subject;
    }
    /**
     * Sets the subject of the learning element
     * @param subject 
     */
    public void setSubject(String subject){
        this.subject= subject;
    }
    /**
     * Gets the description of the learning element
     * @return String This returns the description of the learning element
     */
    public String getDescription(){
        return this.description;
    }
    /**
     * Sets the description of the learning element
     * @param description 
     */
    public void setDescription(String description){
        this.description=description;
    }
    /**
     * Gets the number of downloads of the learning element
     * @return int Returns the number of downloads of the learning element
     */
    public int getDownloads(){
        return this.downloads;
    }
    /**
     * Sets the number of downloads of the learning element
     * @param downloads 
     */
    public void setDownloads(int downloads){
        this.downloads=downloads;
    }
    /**
     * Gets the uploadDate of the learning element
     * @return String This returns the date uploaded of the learning element
     */
    public String getUploadDate(){
        return this.uploadDate;
    }
    /**
     * Sets the date uploaded of the learning element
     * @param uploadDate 
     */
    public void setUploadDate(String uploadDate){
        this.uploadDate=uploadDate;
    }
    /**
     * Gets the file path of the learning element
     * @return String Returns the file path of the learning element
     */
    public String getFilePath() {
        return filepath;
    }
    /**
     * Sets the file path of the learning element
     * @param filepath 
     */
    public void setFilePath(String filepath) {
        this.filepath = filepath;
    }
    /**
     * Gets the rating of the learning element
     * @return double Returns the rating of the learning element
     */
    public double getRating(){
        return this.rating;
    }
    /**
     * Sets the rating of the learning element
     * @param rating 
     */
    public void setRating(double rating){
        this.rating=rating;
    }
    /**
     * Gets the comments of the learning element
     * @return String Returns the commnents of the learning element
     */
    public String getComments(){
        return this.comments;
    }
    /**
     * Sets the comments of the learning element
     * @param comments 
     */
     public void setComments(String comments){
        this.comments=comments;
    }    
    /**
     * Gets the status of the learning element
     * @return 
     */
    public String getStatus(){
        return this.status;
    }
    /**
     * Sets the status of the learning element
     * @param status 
     */
    public void setStatus(String status){
        this.status= status;
    }
    /**
     * Gets the reviewer of the learning element
     * @return String Returns the reviewer of the learning element
     */
    public String getRev(){
        return this.rev;
    }
    /**
     * Sets the reviewer of the learning element
     * @param rev 
     */
     public void setRev(String rev){
        this.rev=rev;
    }
    /**
     * Gets the uploader of the learning element
     * @return String Returns the uploader of the learning element
     */
    public String getUploadedBy(){
        return this.uploadedBy;
    }
    /**
     * Sets the uploader of the learning element
     * @param uploadedBy 
     */
    public void setUploadedBy(String uploadedBy){
        this.uploadedBy=uploadedBy;
    }   
    /**
     * Gets the type of the Learning Object.
     * Example: music, video, text, etc.
     * @return String This returns the type of Learning Object.
     */
    public String getType() {
        return type;
    }
    /**
     * Sets the type of the Learning Object
     * @param type String
     */
    public void setType(String type) {
        this.type = type;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
   
}
