/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.session;

import jakarta.ejb.Local;
import java.util.List;
import za.ac.tut.student.StudentDTO;

/**
 *
 * @author RoseBaloyi
 */
@Local
public interface studentInterface {
    
    public void initializeStudent();
    public void add(StudentDTO student);
    public void remove(int id);
    public List<StudentDTO> view();
    public void destroy();
}
