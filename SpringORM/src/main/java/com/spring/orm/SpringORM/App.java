package com.spring.orm.SpringORM;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.bean.worker;
import com.spring.orm.dao.workerdao;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml")) {
        
    	workerdao doa = (workerdao) ctx.getBean("worker");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = "2014-02-11";
		java.util.Date dateObject = sdf.parse(dateString);
	    	System.out.println("done : "+doa.insert(new worker(4, "Amol", "amol@psl.com", "amol",dateObject, "Started")));

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
    }

