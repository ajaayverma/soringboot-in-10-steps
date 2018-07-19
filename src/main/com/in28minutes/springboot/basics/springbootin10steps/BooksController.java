package com.in28minutes.springboot.basics.springbootin10steps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static javax.print.attribute.standard.ReferenceUriSchemesSupported.HTTP;

@RestController
public class BooksController {
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book>getAllBooks(){
        return Collections.singletonList(new Book(1l, "Mastering Spring", "Ranga"));
    }
}
