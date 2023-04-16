package modal;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_cliente")
public class cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	
	private String nm_cliente;
	
	private String ds_endereco;
	
	private String nr_cliente;
	
	private String nr_conta;
	
	@ManyToOne
	@JoinColumn(name="id_banco")
	private Banco banco;
	
	@OneToMany(mappedBy="cliente", cascade=CascadeType.ALL)
	List<Conta> contas = new ArrayList<Conta>();
	
	
}
