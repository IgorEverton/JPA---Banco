package modal;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="tb_caixa")
public class Caixa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_caixa;
	
	private String nm_caixa;
	private double saldo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_banco")
	private Banco banco;
	
	public void Coletar(double valor) {
		saldo = saldo + valor;
	}
	
}
