package com.company;

public class Book implements IBook {// если красное выделение набираем альт + энтер

    public Book(){
        author = new Author();
}
    public String getBookName(){
        return name;
    }
    @Override
    public void setBookName(String name) {
    this.name=name;//  зис, значит что обращаемся к стринг нэйм
    }

    @Override
    public String getAuthor() {
        return author.name;
    }
    private String name;
    public Author author;

    void setAuthor(String author){
        this.author.name=author;
    }
    class Author{
        public String name;
        public int year;
        public void setName(String name){
            class Test{// класс используется только в этом методе
                public String value;
            }
            Test t = new Test();// выделяет память
            Book.this.setBookName(name);
        }

    }
}
