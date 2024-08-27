/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.session;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;
import za.ac.tut.student.StudentDTO;

/**
 *
 * @author RoseBaloyi
 */
@Stateful
public class StudentSession implements studentInterface {

    private List<StudentDTO> list;
    
    @PostConstruct
    @Override
    public void initializeStudent() {
        list = new ArrayList<StudentDTO>();
    }

    @Override
    public void add(StudentDTO student) {
        list.add(student);
    }

    @Override
    public void remove(int id) {
        
        int i = 0;
        for(StudentDTO student : list){
            if(student.getId() == id){
                list.remove(i);
                i++;
            }
        }
    }

    @Override
    public List<StudentDTO> view() {
        
        return list;
    }

    @Override
    public void destroy() {
        list = null;
    }
    
   
}
