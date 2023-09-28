package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DisciplineController {
    @GetMapping("/disciplines")
    public String showDisciplines(){
        // Реализуем код для отображенеия дисциплин (как и в случае со студентами)
        return null;
    }
    @GetMapping("/addDiscipline")
    public String showAddDiscipline(){
        // Реализуем код для отображения формы
        return null;
    }
    @PostMapping("/addDiscipline")
    public String addDiscipline(){
        // Реализуем код для сохранения в БД
        return null;
    }
    @GetMapping("/editDiscipline/{id}")
    public String showEditDiscipline(){
        // Код с формой для редактирования дисциплин
        return  null;
    }
    @PostMapping("/editDiscipline")
    public String editDiscipline(){
        // Сохраняем изменения в БД
        return null;
    }
    @GetMapping("/deleteDiscipline")
    public String deleteDiscipline(){
        // Удаляем дисциплину из БД
        return null;
    }



}
