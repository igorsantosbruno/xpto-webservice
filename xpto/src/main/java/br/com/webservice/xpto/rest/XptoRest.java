package br.com.webservice.xpto.rest;

import br.com.webservice.xpto.model.XptoEmpresa;
import br.com.webservice.xpto.repository.XptoEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/xptoservice")
public class XptoRest {

    @Autowired
    private XptoEmpresaRepository empresaRepository;

    @RequestMapping(value="/empresa/id",
            method = RequestMethod.GET,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody XptoEmpresa obterIdEmpresa(@RequestParam("hostname") String hostname){

        XptoEmpresa empresa = empresaRepository.findByHostname(hostname).get(0);
        if(empresa != null) {
            return empresa;
        }

        return new XptoEmpresa();
    }
}
