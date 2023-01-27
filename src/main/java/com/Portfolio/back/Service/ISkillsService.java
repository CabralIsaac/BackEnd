package com.Portfolio.back.Service;

import com.Portfolio.back.Entity.Skills;
import java.util.List;



public interface ISkillsService {

    public void saveSkills(Skills skills);

    public void deleteSkills(int id);

    public List<Skills> traerSkills();

    public Skills traerSkillsPorId(int id);

}