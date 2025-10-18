package br.com.limpai.projeto_limpai.repository.entity;

import br.com.limpai.projeto_limpai.model.entity.Usuario;
import br.com.limpai.projeto_limpai.types.UsuarioEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJdbcTest
public class UsuarioRepositoryTests {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Test
    void salvarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setEmail("teste@limpai.com");
        usuario.setSenha("123");
        usuario.setTelefone("11 92151-1511");
        usuario.setTipoUsuario(UsuarioEnum.VOLUNTARIO);

        usuarioRepository.save(usuario);

        assertTrue(usuarioRepository.findById(usuario.getUsuarioId()).isPresent());
    }
}
