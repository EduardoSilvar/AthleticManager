package Modelo;

import Modelo.Cadastro;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-01-26T13:57:54")
@StaticMetamodel(Despesa.class)
public class Despesa_ { 

    public static volatile SingularAttribute<Despesa, Date> data;
    public static volatile SingularAttribute<Despesa, Integer> id;
    public static volatile SingularAttribute<Despesa, Cadastro> IdCadastro;
    public static volatile SingularAttribute<Despesa, Double> Valor;
    public static volatile SingularAttribute<Despesa, String> descricao;

}