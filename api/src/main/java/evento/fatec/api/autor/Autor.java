package evento.fatec.api.autor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Table(name ="autor")
@Entity(name ="autor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Autor {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name="autor_id")
	private Long id;
	private String nome;
	private String email;
	private String instituicao;
	private String fone;
	private boolean ativo;
	
	
	public Autor() {
		
	}
	
	public Autor(Long id) {
		this.id= id;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}


	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Autor (DadosCadastroAutor dados) {
		this.nome = dados.nome();
	}

	public void atualizarInformacoes(@Valid DadosAtualizacaoAutor dados) {
		if(dados.nome() != null)
			this.nome = dados.nome();
	}
}
