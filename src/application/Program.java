package application;

import model.entities.*;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        try {
            //Instantiating courses
            Course javaCourse = new Course("Java Course", "Complete Java course with: Basic syntax, OOP and UML", 40);
            Course sqlCourse = new Course("SQL Course", "Comprehensive SQL course covering: Querying, Database Design, and Optimization", 30);
            Course springBootCourse = new Course("Spring Boot Course", "In-depth Spring Boot course covering: Dependency Injection, REST APIs, and Database Integration", 30);
            Course angularCourse = new Course("Angular Course", "Thorough Angular course covering: Components, Services, and Routing", 40);
            //Instantiating mentoring
            Mentoring englishMentoring = new Mentoring("English Mentoring", "Complete English mentoring covering: Grammar, Vocabulary, and Communication Skills", LocalDate.now());
            Mentoring softSkillsMentoring = new Mentoring("Soft Skills Mentoring", "Comprehensive mentoring program covering: Communication, Leadership, and Time Management", LocalDate.now());
            //Instantiating Bootcamp
            Bootcamp bootcampJava = new Bootcamp("Bootcamp Java", "Complete Java Bootcamp with: Java, SQL, Spring Boot, Angular and more");
            //Add course and mentoring to bootcamp
            bootcampJava.getContents().add(javaCourse);
            bootcampJava.getContents().add(sqlCourse);
            bootcampJava.getContents().add(springBootCourse);
            bootcampJava.getContents().add(angularCourse);
            bootcampJava.getContents().add(englishMentoring);
            bootcampJava.getContents().add(softSkillsMentoring);
            //Instantiating developer
            Developer devJohn = new Developer("John Smith");
            devJohn.subscribeBootcamp(bootcampJava);
            System.out.println("John's Subscribed contents: " + devJohn.getSubscribedContents());
            devJohn.advance();
            devJohn.advance();
            System.out.println("John's Subscribed contents: " + devJohn.getSubscribedContents());
            System.out.println("John's Completed contents: " + devJohn.getCompletedContents());
            System.out.println("John's XP: " + devJohn.calculateTotalXp());
        }
        catch (BootcampException e) {
            System.out.println(e.getMessage());
        }

    }
}
