package jdbc2.Demo;

import jdbc2.dao.impl.ProjectUserDaoImpl;
import jdbc2.model.Project;
import jdbc2.model.User;

public class Demo {

    public static void main(String[] args) {

        User user1 = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);
        User user4 = new User(4);
        User user5 = new User(5);
        User user6 = new User(6);
        User user7 = new User(7);
        User user8 = new User(8);
        Project project1 = new Project(1);
        Project project5 = new Project(5);
        Project project6 = new Project(6);

        ProjectUserDaoImpl projectUserDao=new ProjectUserDaoImpl();

        projectUserDao.addUserOnProject(user1,project1 );
        projectUserDao.addUserOnProject(user2,project5 );
        projectUserDao.addUserOnProject(user3,project6 );
        projectUserDao.addUserOnProject(user2,project1 );
        projectUserDao.addUserOnProject(user3,project5 );
        projectUserDao.addUserOnProject(user5,project1 );
        projectUserDao.addUserOnProject(user7,project1 );


    }
}
