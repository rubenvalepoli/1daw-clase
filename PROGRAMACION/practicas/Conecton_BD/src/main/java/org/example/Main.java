package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String sql = """
        INSERT INTO movies (imdb_id, title, year, image, runtime, description, director_id) 
        VALUES (?, ?, ?, null, ?, null, ?)                    
    """;
        List<Object> params = List.of(
                "tt0071524", "Primera plana", 1974, 105, "nm0000697"
        );
        System.out.println("Película insertada con id " + RawSql.insert(sql, params));;
    }
}