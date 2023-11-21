package jihe_test;

import java.util.*;

public class test_01 {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《1》",1,"你好1"));
        movies.add(new Movie("《2》",2,"你好2"));
        movies.add(new Movie("《3》",3,"你好3"));
//        System.out.println(movies);
        for (Movie movie : movies) {
            System.out.println("电影名称："+movie.getName());
            System.out.println("电影评分："+movie.getScore());
            System.out.println("电影主演："+movie.getActor());
            System.out.println("------------------------------");
        }

    }
}
