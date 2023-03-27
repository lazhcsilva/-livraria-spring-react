import React from "react";

function FormBook() {
    return (
        <div>
            <form>
                <div>
                    <h1>Cadastrar livro</h1>
                </div>
                <div className="form-group">
                    <label for="bookName">Nome do livro:</label>
                    <input type="text" className="form-control" id="bookName" />
                </div>
                <div className="form-group">
                    <label for="author">Autor:</label>
                    <input type="text" className="form-control" id="author" />
                </div>
                <div className="form-group">
                    <label for="numberPage">Numero de páginas:</label>
                    <input type="number" className="form-control" id="numberPage" />
                </div>
                <div className="form-group">
                    <label for="categoria">Categoria:</label>
                    <select className="form-control" id="categoria">
                        <option>Fantasia</option>
                        <option>Ficção Cientifica</option>
                        <option>Suspense</option>
                        <option>Terror</option>
                        <option>Romance</option>
                    </select>
                </div>
            </form>
        </div>
    )
}

export default FormBook;