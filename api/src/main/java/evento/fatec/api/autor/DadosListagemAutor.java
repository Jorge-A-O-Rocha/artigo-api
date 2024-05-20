package evento.fatec.api.autor;

public record DadosListagemAutor(
		Long id,
		String nome) {
	public DadosListagemAutor (Autor autor) {
		this(autor.getId(),
				autor.getNome());
	}

}
