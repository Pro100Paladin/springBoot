package ru.medvedev.hometask7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.medvedev.hometask7.entity.RoleEntity;
import ru.medvedev.hometask7.entity.UserEntity;
import ru.medvedev.hometask7.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(ReaderProperties.class)
public class HomeTask7Application {

	public static void main(String[] args) {
//		SpringApplication.run(HomeTask7Application.class, args);

		UserRepository userRepository = SpringApplication.run(HomeTask7Application.class, args).getBean(UserRepository.class);
		saveUser(userRepository, "admin");
		saveUser(userRepository, "reader");
		saveUser(userRepository, "auth");
		saveUser(userRepository, "simple");
	}

	private static void saveUser(UserRepository repository, String login) {
		UserEntity user = new UserEntity();
		user.setLogin(login);
		user.setPassword(login);
		List<RoleEntity> roles = new ArrayList<>();
		roles.add(new RoleEntity(login));
		user.setRoles(roles);
		repository.save(user);
	}

}
