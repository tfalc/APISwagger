package tfalc.apiswagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tfalc.apiswagger.model.Usuario;
import tfalc.apiswagger.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public List<Usuario> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getUsuarioByUsername(@PathVariable("username") String username) {
        return userRepository.findByUsername(username);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }

    @PostMapping("/adduser")
    public void addUser(@RequestBody Usuario username){
        userRepository.save(username);
    }

}
