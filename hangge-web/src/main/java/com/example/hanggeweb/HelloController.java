package com.example.hanggeweb;

import com.example.hanggedao.Book;
import com.example.hanggeservice.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @MethodName: $
 * @Description: TODO
 * @Param: $
 * @Return: $
 * @Author: zhangliqian
 * @Date: $
 */
@RestController
public class HelloController {

    @Autowired
    BookService bookService;

    @GetMapping("test")
    public List<Book> test() {
        return bookService.allBooks();
    }
}
