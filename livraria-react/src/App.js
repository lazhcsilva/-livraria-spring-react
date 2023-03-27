import React, { useEffect } from 'react';
import { useState } from 'react';
import Header from './components/Header/Header';
import Table from './components/RegisterBook/Table/Table';

function App() {

  const book = {
    idBook : 0,
    name : '',
    author : '',
    pages : '',
    category : ''
  }

  const [btnRegister, setBtnRegister] = useState(true);
  const [books, setBooks] = useState([]);
  const [objBook, setObjBook] = useState(book);


  useEffect(() => {
    fetch('http://localhost:8080/listBook')
    .then(books => books.json())
    .then(books_converted => setBooks(books_converted));
  }, []);

  return (
    <div className="App">
      <Header />
      <Table vector={books}/>
    </div>
  );
}

export default App;
