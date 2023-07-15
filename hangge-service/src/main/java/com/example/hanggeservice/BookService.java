package com.example.hanggeservice;

import com.example.hanggedao.Book;
import com.example.hanggedao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @MethodName: $
 * @Description: 本项目用于实验springboot多模块项目的搭建
 * https://www.hangge.com/blog/cache/detail_2833.html
 * @Param: $
 * @Return: $
 * @Author: zhangliqian
 * @Date: $
 */
@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public List<Book> allBooks() {
        return bookDao.findAll();
    }
}
