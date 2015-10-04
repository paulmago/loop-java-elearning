/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.card.loop.xyz.service;

import com.card.loop.xyz.dao.LearningObjectDAO;
import com.card.loop.xyz.dto.LearningObjectDto;
import com.card.loop.xyz.model.LearningObject;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aislinn
 * 
 * [09/30/2015] -   Vine Deiparine  - Added getLearningObjects
 */
public class LearningObjectService 
{
    public LearningObjectDto getSpecificLearningObject(LearningObjectDto lo) throws UnknownHostException{
        LearningObject loModel;
        loModel = LearningObjectDAO.getSpecificLearningObject(lo.getName());
       if(loModel != null){
  
            lo.setId(loModel.getID());
           // lo.setId(loModel.getID());
            lo.setName(loModel.getName());
            lo.setDescription(loModel.getDescription());
            lo.setSubject(loModel.getSubject());
            lo.setDateUploaded(loModel.getDateUploaded());
            
            /*dto.setDownloads(model.getDownloads());           
            dto.setRating(model.getRating());
            dto.setRev(model.getRev());
            dto.setStatus(model.getStatus());
            dto.setComments(model.getComments());
            dto.setUploadedBy(model.getUploadedBy());
            dto.setFilepath(model.getFilepath());
            */
        }
        return lo;
    }
    
    public List<LearningObjectDto> getLearningObjects() throws UnknownHostException{
        List<LearningObject> LOList = LearningObjectDAO.getList();//LearningObjectDAO.getAllLearningObjectByDateUpload(new Date());
        List<LearningObjectDto> objects = new ArrayList<>();
        for(LearningObject model: LOList){
            LearningObjectDto dto = new LearningObjectDto();
          //  dto.setId(model.getID());
            dto.setRating(model.getRating());
            dto.setName(model.getName());
            dto.setDescription(model.getDescription());
            dto.setSubject(model.getSubject());
            dto.setDownloads(model.getDownloads());
            dto.setDateUploaded(model.getDateUploaded());
            dto.setRev(model.getRev());
            dto.setUploadedBy(model.getUploadedBy());
            dto.setComments(model.getComments());
            dto.setRev(model.getRev());
            dto.setStatus(model.getStatus());
            dto.setUploadedBy(model.getUploadedBy());
            objects.add(dto);
        }
        return objects;
    }
    
    public List<LearningObjectDto> getReviewerLOList(String rev) throws UnknownHostException{
        List<LearningObject> LOList = LearningObjectDAO.getReviewerLOList(rev);//LearningObjectDAO.getAllLearningObjectByDateUpload(new Date());
        List<LearningObjectDto> objects = new ArrayList<>();
        for(LearningObject model: LOList){
            LearningObjectDto dto = new LearningObjectDto();
          //  dto.setId(model.getID());
            dto.setRating(model.getRating());
            dto.setName(model.getName());
            dto.setDescription(model.getDescription());
            dto.setSubject(model.getSubject());
            dto.setDownloads(model.getDownloads());
            dto.setDateUploaded(model.getDateUploaded());
            dto.setRev(model.getRev());
            dto.setUploadedBy(model.getUploadedBy());
            dto.setComments(model.getComments());
            dto.setRev(model.getRev());
            dto.setStatus(model.getStatus());
            dto.setUploadedBy(model.getUploadedBy());
            objects.add(dto);
        }
        return objects;
    }
}
