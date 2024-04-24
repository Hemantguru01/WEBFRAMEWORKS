package com.example.day5cw3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.model.Hemant_model;
import com.example.day5cw3.repository.Hemant_repo;

@Service
public class LanguageService {
    private Hemant_repo languageRepo;
    public LanguageService(Hemant_repo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(Hemant_model language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Hemant_model> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,Hemant_model language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public Hemant_model getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
