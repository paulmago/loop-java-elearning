/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.card.loop.xyz.service;

import com.card.loop.xyz.dao.LearningElementDAO;
import com.card.loop.xyz.dto.LearningElementDto;
import com.card.loop.xyz.model.LearningElement;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Julie Jane Alegre
 */
@Service
public class LearningElementService {
    @Autowired LearningElementDAO dao;
    
    public LearningElementDto getSpecificLearningElement(String id) throws UnknownHostException{
        LearningElement leModel;
        leModel = dao.getSpecificLearningElement(id);
        LearningElementDto dto = new LearningElementDto();
       if(leModel != null){  
            dto.setId(leModel.getId());
            dto.setTitle(leModel.getTitle());
            dto.setDescription(leModel.getDescription());
            dto.setSubject(leModel.getSubject());
            dto.setDateUploaded(leModel.getDateUploaded());
            dto.setDownloads(leModel.getDownloads());           
            dto.setRating(leModel.getRating());
            dto.setRev(leModel.getRev());
            dto.setStatus(leModel.getStatus());
            dto.setComments(leModel.getComments());
            dto.setUploadedBy(leModel.getUploadedBy());
            dto.setFilepath(leModel.getFilePath());            
        }
        return dto;
    }
    
     public List<LearningElementDto> getLearningElements() throws UnknownHostException{
        List<LearningElement> LOList = dao.getList();
        List<LearningElementDto> objects = new ArrayList<>();
        for(LearningElement model: LOList){
            LearningElementDto dto = new LearningElementDto();
            dto.setId(model.getId());
            dto.setRating(model.getRating());
            dto.setTitle(model.getTitle());
            dto.setDescription(model.getDescription());
            dto.setSubject(model.getSubject());
            dto.setDownloads(model.getDownloads());
            dto.setDateUploaded(model.getDateUploaded());
            dto.setUploadedBy(model.getUploadedBy());
            dto.setComments(model.getComments());
            dto.setRev(model.getRev());
            dto.setStatus(model.getStatus());
            objects.add(dto);
        }
        return objects;
     }
     
    public List<LearningElementDto> getLearningElements(String keyword) throws UnknownHostException{
                        System.out.println("HAHALE");

        List<LearningElement> LOList;
                        System.out.println("HAHAF");

        LOList = dao.searchLE(keyword);
        List<LearningElementDto> objects = new ArrayList<>();
        for(LearningElement model: LOList){
            LearningElementDto dto = new LearningElementDto();
            dto.setId(model.getId());
            dto.setRating(model.getRating());
            dto.setTitle(model.getTitle());
            dto.setDescription(model.getDescription());
            dto.setSubject(model.getSubject());
            dto.setDownloads(model.getDownloads());
            dto.setDateUploaded(model.getDateUploaded());
            dto.setUploadedBy(model.getUploadedBy());
            dto.setComments(model.getComments());
            dto.setRev(model.getRev());
            dto.setStatus(model.getStatus());
            objects.add(dto);
        }
        return objects;
     }
    
    
    public static void main(String[] args) throws UnknownHostException {
        List<LearningElementDto> list;
        LearningElementService service = new LearningElementService();
        list = service.getLearningElements("Test");
     /*   for (LearningElementDto list1 : list) {
            System.out.println(list1);
        }*/
    }
    
}
