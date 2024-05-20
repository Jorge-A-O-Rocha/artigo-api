package evento.fatec.api.area;

import jakarta.validation.constraints.NotNull;

public record DadosCadastroArea(
		@NotNull
		String descricao) {

}
