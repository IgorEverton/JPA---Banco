package modal;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_banco")
public class Banco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_banco;
	
	private String nm_banco;
	
	private String lc_banco;
	
	@OneToMany(mappedBy="banco", cascade=CascadeType.ALL)
	List<Caixa> caixas = new ArrayList<Caixa>();
	
	@OneToMany(mappedBy="banco", cascade=CascadeType.ALL)
	List<cliente> clientes = new ArrayList<cliente>();

	
	
	
	
	
}
