package Modelo;

import Modelo.Cadastro;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-01-26T13:57:54")
@StaticMetamodel(Membro.class)
public class Membro_ { 

    public static volatile SingularAttribute<Membro, String> senha;
    public static volatile SingularAttribute<Membro, Cadastro> Id_Cadastro;
    public static volatile SingularAttribute<Membro, String> endereco;
    public static volatile SingularAttribute<Membro, String> cpf;
    public static volatile SingularAttribute<Membro, String> celular;
    public static volatile SingularAttribute<Membro, String> nome;
    public static volatile SingularAttribute<Membro, Integer> id;
    public static volatile SingularAttribute<Membro, Date> Data_Inscricao;

}