/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.card.loop.xyz.model;

/**
 * REVISION HISTORY
 * 
 * [2015/09/09]     -   Vine Deiparine  -   Initial Codes 
 * 
 */
public class LearningObject {

    /*
    *Id of the Learning Object
    */
    private Long id;
    /*
    *Name of the Learning Object
    */
    private String name;
    /*
    *Subject of the Learning Object. e.g. (Math, English)
    */
    private String subject;
    /*
    *Description of the Learning Object.
    */
    private String description;
    /*
    *Number of downloads of the Learning Object.
    */
    private int downloads;
    /*
    *Date of the Learning Object is uploaded.
    */
    private String dateUploaded;
    /*
    *Filepath of the Learning Object.
    */
    private String filepath;
    /*
    *Rating of the Learning Object.
    */
    private double rating;
    /*
    *Comments for the Learning Object.
    */
    private String comments;
    /*
    *Status of the Learning Object.
    *Can be one of the following: Reviewed, Being Reviewed, Not Yet Reviewed
    */
    private String status;
    /*
    *Name of the reviewer of the Learning Object.
    */
    private String rev;
    /*
    *Name of the uploader of the Learning Object.
    */
    private String uploadedBy;
    /*
    *Type of the Learning Object.
    *Example: music, video, text, etc.
    */
    private String type;

    /**
     * Gets the name of the uploader of the Learning Object
     * @return String This returns the name of uploader.
     */
    public String getUploadedBy(){
        return this.uploadedBy;
    }

    /**
     * Gets the Id of the Learning Object
     * @return Long This returns the id of Learning Object.
     */
    public Long getID(){
        return this.id;
    }

    /**
     * Gets the status of the Learning Object
     * @return String This returns the status of Learning Object.
     */
    public String getStatus(){
        return this.status;
    }

    /**
     * Gets the name of the Learning Object.
     * @return String This returns the name of Learning Object.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Gets the subject of the Learning Object.
     * @return String This returns the subject of Learning Object.
     */
    public String getSubject(){
        return this.subject;
    }

    /**
     * Gets the description of the Learning Object.
     * @return String This returns the description of Learning Object.
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Gets the number of downloads of the Learning Object.
     * @return int This returns the number of downloads of Learning Object.
     */
    public int getDownloads(){
        return this.downloads;
    }

    /**
     * Gets the uploaded date of the Learning Object.
     * @return String This returns the uploaded date of Learning Object.
     */
    public String getDateUploaded(){
        return this.dateUploaded;
    }

    /**
     * Gets the filepath of the Learning Object.
     * @return String This returns the filepath of Learning Object.
     */
    public String getFilepath(){
        return this.filepath;
    }

    /**
     * Gets the rating of the Learning Object.
     * @return double This returns the rating of Learning Object.
     */
    public double getRating(){
        return this.rating;
    }

    /**
     * Gets the comments of the Learning Object.
     * @return String This returns the comments of Learning Object.
     */
    public String getComments(){
        return this.comments;
    }

    /**
     * Gets the name of the reviewer of the Learning Object.
     * @return String This returns the reviewer of Learning Object.
     */
    public String getRev(){
        return this.rev;
    }

    /**
     * Gets the type of the Learning Object.
     * Example: music, video, text, etc.
     * @return String This returns the type of Learning Object.
     */
    public String getType(){
        return this.type;
    }

    /**
     * Sets the type of the Learning Object
     * @param type String
     */
    public void setType(String type){
        this.type = type;
    }

    /**
     * Sets the name of the reviewer of the Learning Object
     * @param rev String
     */
    public void setRev(String rev){
        this.rev = rev;
    }

    /**
     * Sets the id of the Learning Object
     * @param id Long
     */
    public void setID(Long id){
        this.id = id;
    }

    /**
     * Sets the status of the Learning Object to Reviewed, Being Reviewed, or
     * Not Yet Reviewed
     * @param status String
     */
    public void setStatus(String status){
        this.status = status;
    }

    /**
     * Sets the name of the Learning Object
     * @param name String
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the subject of the Learning Object
     * @param subject String
     */
    public void setSubject(String subject){
        this.subject= subject;
    }

    /**
     * Sets the description of the Learning Object
     * @param description String
     */
    public void setDescription(String description){
        this.description= description;
    }

    /**
     * Sets the number of downloads of the Learning Object
     * @param downloads int
     */
    public void setDownloads(int downloads){
        this.downloads =downloads;
    }

    /**
     * Sets the date that the Learning Object is uploaded
     * @param dateUploaded String
     */
    public void setDateUploaded(String dateUploaded){
        this.dateUploaded = dateUploaded;
    }

    /**
     * Sets the filepath of the Learning Object
     * @param filepath String
     */
    public void setFilepath(String filepath){
        this.filepath= filepath;
    }

    /**
     * Sets the rating of the Learning Object
     * @param rating String
     */
    public void setRating(double rating){
        this.rating = rating;
    }

    /**
     * Sets the comments of the Learning Object
     * @param comments String
     */
    public void setComments(String comments){
        this.comments = comments;
    }

    /**
     * Sets the name of the uploader of the Learning Object
     * @param uploadedBy String
     */
    public void setUploadedBy(String uploadedBy){
        uploadedBy= uploadedBy;
    }
    
}