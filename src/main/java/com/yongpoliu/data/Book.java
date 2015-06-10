package com.yongpoliu.data;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.ToString;

@Data @ToString
@XmlRootElement(name = "Book")
public class Book {

  @XmlElement(name = "title")
  private String title;

  @XmlElementWrapper(name = "ref-books")
  @XmlElement(name = "book")
  private List<Book> refs;
}
