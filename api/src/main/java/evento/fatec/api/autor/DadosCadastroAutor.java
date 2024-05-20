package evento.fatec.api.autor;

import jakarta.validation.constraints.NotNull;

public record DadosCadastroAutor(
		@NotNull
		String nome,
		String email,
		String instituicao,
		boolean ativo) {

}
