/*
package com.project.hms.service;

import com.project.hms.model.Employee;
import com.project.hms.repository.EmployeeRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

*/
/*
@Service
public class CustomEmployeeServiceImpl implements UserDetailsService {

    //@Autowired
    private final  EmployeeRepository employeeRepository;
    public CustomEmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee employee = employeeRepository.findByUsername(username);
        if (employee == null){
            throw new UsernameNotFoundException("Customer Not Found!!!");
        }
        return new org.springframework.security.core.userdetails.User(employee.getUsername(),
                employee.getPassword(), true,true,true,true,
                getAuthorities(employee.getRole().getRoleName()));
    }

    public Collection<? extends SimpleGrantedAuthority> getAuthorities(String roleName){
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(roleName));
        return authorities;
    }
}
*/

