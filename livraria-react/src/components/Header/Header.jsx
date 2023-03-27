import React from "react";
import { Container, Nav, Navbar } from "react-bootstrap";
import FormBook from "../RegisterBook/Form/FormBook";
import DeleteBook from "../RegisterBook/Form/FormDelete";
import UpdateBook from "../RegisterBook/Form/FormUpdate";
import Table from "../RegisterBook/Table/Table";

import './Header';

function Header() {
    return (
        <Navbar bg="dark" variant="dark">
            <Container>
                <Navbar.Brand href="/">Livraria</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-var" />
                <Navbar.Collapse id="basic-navbar-nav" />
                    <Nav className="me-auto">
                        <Nav.Link href="">Listar</Nav.Link>
                        <Nav.Link href="#">Cadastrar</Nav.Link>
                        <Nav.Link href="#">Atualizar</Nav.Link>
                        <Nav.Link href="#">Deletar</Nav.Link>
                    </Nav>
            </Container>
        </Navbar>
    )
}

export default Header;