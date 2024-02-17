
package com.fu.di.dao;

import com.fu.di.dto.Student;
import con.fu.di.util.Filter;

/**
 *
 * @author Sang
 */
public class FilterBySE implements Filter<Student>{

    @Override
    public boolean check(Student x) {
        if(x.getMajor().equalsIgnoreCase("SE"))
            return true; 
        return false;
    }
}
