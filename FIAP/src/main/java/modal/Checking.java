package modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_checking")
public class Checking extends Conta{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_checking;
	
	
}
