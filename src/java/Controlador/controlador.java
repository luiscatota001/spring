
package Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import config.conexion;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;


@Controller
public class controlador {
    conexion con=new conexion();
    JdbcTemplate jdbcTemplate=new JdbcTemplate(con.Conectar());
    ModelAndView mav=new ModelAndView();
    
    @RequestMapping("index.htm")
    public ModelAndView Listar(){
    String sql="select * from persona";
    List datos=this.jdbcTemplate.queryForList(sql);
    mav.addObject("lista",datos);
    mav.setViewName("index");
    return mav;
    }
    
}
