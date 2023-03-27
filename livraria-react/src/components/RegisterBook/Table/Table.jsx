function Table({vector}){
    return(
        <table className="table" striped bordered hover>
            <thead>
                <tr>
                    <th>#</th>
                    <th>Nome</th>
                    <th>Autor</th>
                    <th>Paginas</th>
                    <th>Categoria</th>
                </tr>
            </thead>
            <tbody>
                {
                    vector.map((obj, index) => (
                        <tr key={index}>
                            <td>{index + 1}</td>
                            <td>{obj.name}</td>
                            <td>{obj.author}</td>
                            <td>{obj.pages}</td>
                            <td>{obj.category}</td>
                        </tr>
                    ))
                }
            </tbody>
        </table>
    )
}

export default Table;