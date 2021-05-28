package com.spring.codeblog.util;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {
    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postsList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Carlos Bezerra");
        post1.setData(LocalDate.now());
        post1.setTitulo("Docker");
        post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque scelerisque massa non viverra facilisis. Aenean ex metus, laoreet eget elementum vitae, lobortis pretium dui. Aenean a commodo lectus. Nulla non odio quis leo cursus interdum ut id leo. Fusce varius nisi nisi, non aliquam arcu fringilla quis. Duis urna justo, tempus ac faucibus in, efficitur sed nisl. Vivamus et nunc mi.\n" + "\n" + "Pellentesque accumsan nisi velit, eget dictum eros rhoncus vel. Nulla placerat placerat ante, ut interdum neque. Cras nec turpis maximus, faucibus lorem in, dapibus libero. Donec ac velit ligula. Donec eu enim euismod, convallis orci in, euismod metus. Praesent suscipit enim sed nulla imperdiet, sit amet lobortis dolor vulputate. Mauris ligula lectus, pellentesque sed arcu eu, finibus viverra enim. Nulla dignissim ex quam, non maximus dui cursus in. Suspendisse mattis ac diam volutpat facilisis. Proin vel euismod arcu. Nullam efficitur mi nunc, eget sodales urna hendrerit quis.\n" + "\n");

        Post post2 = new Post();
        post2.setAutor("Carlos Bezerra");
        post2.setData(LocalDate.now());
        post2.setTitulo("API REST");
        post2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque scelerisque massa non viverra facilisis. Aenean ex metus, laoreet eget elementum vitae, lobortis pretium dui. Aenean a commodo lectus. Nulla non odio quis leo cursus interdum ut id leo. Fusce varius nisi nisi, non aliquam arcu fringilla quis. Duis urna justo, tempus ac faucibus in, efficitur sed nisl. Vivamus et nunc mi.\n" + "\n" + "Pellentesque accumsan nisi velit, eget dictum eros rhoncus vel. Nulla placerat placerat ante, ut interdum neque. Cras nec turpis maximus, faucibus lorem in, dapibus libero. Donec ac velit ligula. Donec eu enim euismod, convallis orci in, euismod metus. Praesent suscipit enim sed nulla imperdiet, sit amet lobortis dolor vulputate. Mauris ligula lectus, pellentesque sed arcu eu, finibus viverra enim. Nulla dignissim ex quam, non maximus dui cursus in. Suspendisse mattis ac diam volutpat facilisis. Proin vel euismod arcu. Nullam efficitur mi nunc, eget sodales urna hendrerit quis.\n" + "\n");

        postsList.add(post1);
        postsList.add(post2);

        for(Post post : postsList) {
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId().toString());
        }

    }
}
