package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

class BookControllerTestSuite {

    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        Assertions.assertEquals(result, booksList);
    }

    @Test
    public void shouldAddBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto bookDto = new BookDto("Title 3", "Author 3");

        //when
        bookController.addBook(bookDto);

        //then
        Mockito.verify(bookServiceMock).addBook(bookDto);
    }

    @Test
    public void shouldRemoveBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto bookDto = new BookDto("Title 3", "Author 3");

        //when
        bookController.removeBook(bookDto);

        //then
        Mockito.verify(bookServiceMock).removeBook(bookDto);
    }
}