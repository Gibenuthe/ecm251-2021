package benuthe.giovanni.Models;

import benuthe.giovanni.Enum.Horario;
import benuthe.giovanni.Enum.Tipos;
import benuthe.giovanni.Interfaces.Apresentacao;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.*;
import java.util.*;
import java.util.Iterator;
import java.util.function.Consumer;

public class Sistema {

    private boolean executarSistema = true;
    Horario horarioAtual = Horario.REGULAR;
    int ExecutaBB = 0;
    Tipos cat;
    String usuarioAtual;


    Scanner escolha = new Scanner(System.in);
    Scanner Nome = new Scanner(System.in);
    Scanner Email = new Scanner(System.in);
    Scanner Funcao = new Scanner(System.in);
    Scanner Exclusao = new Scanner(System.in);
    Scanner Horarios = new Scanner(System.in);
    Scanner Usuario = new Scanner(System.in);

    
    Iterator iterator = new Iterator() {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    };


    LinkedList<Membros> Membros = new LinkedList<Membros>();
    //ArrayList<Membros> Membros = new ArrayList<>();

    //BigBrothers Juli = new BigBrothers("Julliete", "ajdf@uishd.com", Tipos.BIG_BROTHERS);
    //Membros.add(new BigBrothers("Julliete", "ajdf@uishd.com", Tipos.BIG_BROTHERS));


    public void executar() throws IOException{
        String opcao;
        AbrirCSV();
        Login();
        if(ExecutaBB == 2){
            while(executarSistema) {
                MenuPad();
                opcao = escolha.next().toUpperCase(Locale.ROOT);
                avaliarOpcaoPad(opcao);
            }
        }
        else if(ExecutaBB == 1){
            while(executarSistema) {
                Menu();
                opcao = escolha.next().toUpperCase(Locale.ROOT);
                avaliarOpcao(opcao);
            }
        }
    }


    public void AbrirCSV(){
        File arquivoCSV = new File("D:\\Documents\\GitHub\\ecm251-2021\\Atividade02\\src\\benuthe\\giovanni\\arquivo_super_Secreto_nao_abrir.csv");
        try {
            String linhasDoArquivo = new String();
            Scanner leitor = new Scanner(arquivoCSV);
            while(leitor.hasNext()){
                linhasDoArquivo = leitor.nextLine();
                String[] splitted = linhasDoArquivo.split(";(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                //System.out.println(linhasDoArquivo);
                String nome = splitted[0];
                String email = splitted[1];
                String categoria = splitted[2];
                //System.out.println("Nome: "+nome+" Email: "+email+" Categoria: "+categoria+" Tipo: "+Tipos.BIG_BROTHERS);
                if(categoria.equals(Tipos.BIG_BROTHERS.toString())){
                    cat = Tipos.BIG_BROTHERS;
                    Membros.add(new BigBrothers(nome, email, cat));
                }
                else if(categoria.equals(Tipos.HEAVY_LIFTERS.toString())){
                    cat = Tipos.HEAVY_LIFTERS;
                    Membros.add(new HeavyLifters(nome, email, cat));
                }
                else if(categoria.equals(Tipos.MOBILE_MEMBERS.toString())){
                    cat = Tipos.MOBILE_MEMBERS;
                    Membros.add(new MobileMembers(nome, email, cat));
                }
                else if(categoria.equals(Tipos.SCRIPT_GUYS.toString())){
                    cat = Tipos.SCRIPT_GUYS;
                    Membros.add(new ScriptGuys(nome, email, cat));
                }
            }
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
    }

        public void Login() {
            System.out.println("------Tela de Login-------");
            System.out.println("Username: ");
            usuarioAtual = Usuario.next();
            for (Iterator<Membros> iter = Membros.iterator(); iter.hasNext(); ) {
                Membros membro = iter.next();
                if (membro.getFuncao() == Tipos.BIG_BROTHERS) {
                    if(usuarioAtual.equals(membro.getUsername())){
                        System.out.println("Bem Vindo BigBrother !!");
                        ExecutaBB = 1;
                        break;
                    }
                }
                else {
                    if(usuarioAtual.equals(membro.getUsername())){
                        System.out.println("Bem Vindo usuario padrao !");
                        ExecutaBB = 2;
                        break;
                    }
                    else {
                        System.out.println("Usuario nao existe.");
                        break;
                    }
                }
            }
        }


        public void Menu(){
        System.out.println("--------------------------");
        System.out.println("B3M V1ND0 40 MAsK_S0c13ty!");
        System.out.println("---------------------------");
        System.out.println("Horario Atual: " + horarioAtual);
        System.out.println("Escolha uma ação: ");
        System.out.println("[C]adastrar Membro");
        System.out.println("[P]ostar Mensagem");
        System.out.println("[T]rocar Horario");
        System.out.println("[E]xcluir Membro");
        System.out.println("[R]elatorio Geral");
        System.out.println("[S]air");

        }

    public void MenuPad(){
        System.out.println("--------------------------");
        System.out.println("B3M V1ND0 40 MAsK_S0c13ty!");
        System.out.println("---------------------------");
        System.out.println("Horario Atual: " + horarioAtual);
        System.out.println("Escolha uma ação: ");
        System.out.println("[P]ostar Mensagem");
        System.out.println("[T]rocar Horario");
        System.out.println("[R]elatorio Geral");
        System.out.println("[S]air");

    }

    private void avaliarOpcao(String opcao) throws IOException {
        switch (opcao) {
            case "C":
                System.out.println("Digite o nome do novo membro: ");
                String nome = Nome.next();
                System.out.println("Digite o email do novo membro: ");
                String email = Email.next();
                System.out.println("Selecione a funcao do novo membro:\n1- BigBrother\n2- HeavyLifter\n3- MobileMember\n4- ScriptGuy");
                int funcao = Funcao.nextInt();
                if(funcao == 1){
                    Membros.add(new BigBrothers(nome, email, Tipos.BIG_BROTHERS));
                }
                else if (funcao == 2){
                    Membros.add(new HeavyLifters(nome, email, Tipos.HEAVY_LIFTERS));
                }
                else if (funcao == 3){
                    Membros.add(new MobileMembers(nome, email, Tipos.MOBILE_MEMBERS));
                }
                else if (funcao == 4){
                    Membros.add(new ScriptGuys(nome, email, Tipos.SCRIPT_GUYS));
                }
                else{
                    System.out.println("Funcao invalida, tente cadastrar novamente.");
                }
                PrintWriter pw = new PrintWriter("D:\\Documents\\GitHub\\ecm251-2021\\Atividade02\\src\\benuthe\\giovanni\\arquivo_super_Secreto_nao_abrir.csv");
                for(Membros membro : Membros){
                    pw.println(membro.getUsername() + ";" + membro.getEmail() + ";" + membro.getFuncao().toString());
                }
//                Iterator s = Membros.iterator();
//                while(s.hasNext()){
//                    Membros current  = (Membros) s.next();
//                    System.out.println(current.toString()+"\n");
//                    pw.append(current.getUsername());
//                    pw.append(",");
//                    pw.append(current.getEmail());
//                    pw.append(",");
//                    pw.append(current.getFuncao().toString());
//                    pw.append("\n");
//                }
//                pw.flush();
                pw.close();
                break;
            case "P":
                if(horarioAtual == Horario.REGULAR){
                    for(Membros membro : Membros){
                        membro.postarRegular();
                    }
                }
                else {
                    for(Membros membro : Membros){
                        membro.postarExtra();
                    }
                }
                break;
            case "T":
                System.out.println("Deseja trocar o horario? (s/n)");
                String horario = Horarios.next();
                if(horario.toUpperCase(Locale.ROOT).equals("S")){
                    if(horarioAtual == benuthe.giovanni.Enum.Horario.REGULAR){
                        horarioAtual = Horario.EXTRAS;
                    }
                    else{
                        horarioAtual = Horario.REGULAR;
                    }
                }
                else{
                    System.out.println("Ok, volte quando quiser..");
                }
                break;
            case "E":
                System.out.println("Lista de membros:");
                for(Object o : Membros){
                    System.out.println(o.toString());
                }
                System.out.println("Digite o nome do membro que deseja excluir:");
                String exclusao = Exclusao.next();
                for(Iterator<Membros> iter = Membros.iterator(); iter.hasNext();) {
                    Membros membro = iter.next();
                    if(exclusao.equals("B1az3")){
                        System.out.println("Esse membro nao pode ser excluido!");
                        break;
                    }
                    else if (exclusao.equals(membro.getUsername())) {
                            //iter.remove();
                            Membros.remove(membro);
                            PrintWriter pw2 = new PrintWriter("D:\\Documents\\GitHub\\ecm251-2021\\Atividade02\\src\\benuthe\\giovanni\\arquivo_super_Secreto_nao_abrir.csv");
                            for(Membros membro2 : Membros){
                            pw2.println(membro2.getUsername() + ";" + membro2.getEmail() + ";" + membro2.getFuncao().toString());
                            }
                            pw2.close();
                            System.out.println("Membro excluido com sucesso.");
                            break;
                        }
                    }
                break;
            case "R":
                for (Iterator<Membros> iter = Membros.iterator(); iter.hasNext(); ) {
                    Membros membro = iter.next();
                    if (usuarioAtual.equals(membro.getUsername())) {
                        membro.apresentar();
                        for (Object o : Membros) {
                            System.out.println(o.toString());
                        }
                    }
                }
                break;
            case "S":
                executarSistema = false;
                break;
            default:
                System.out.println("Digite um comando valido!");

        }



    }

    private void avaliarOpcaoPad(String opcao) {
        switch (opcao) {
            case "P":
                if(horarioAtual == Horario.REGULAR){
                    for(Membros membro : Membros){
                        membro.postarRegular();
                    }
                }
                else {
                    for(Membros membro : Membros){
                        membro.postarExtra();
                    }
                }
                break;
            case "T":
                System.out.println("Deseja trocar o horario? (s/n)");
                String horario = Horarios.next();
                if(horario.toUpperCase(Locale.ROOT).equals("S")){
                    if(horarioAtual == benuthe.giovanni.Enum.Horario.REGULAR){
                        horarioAtual = Horario.EXTRAS;
                    }
                    else{
                        horarioAtual = Horario.REGULAR;
                    }
                }
                else{
                    System.out.println("Ok, volte quando quiser..");
                }
                break;
            case "R":
                for (Iterator<Membros> iter = Membros.iterator(); iter.hasNext(); ) {
                    Membros membro = iter.next();
                    if (usuarioAtual.equals(membro.getUsername())) {
                        membro.apresentar();
                        for (Object o : Membros) {
                            System.out.println(o.toString());
                        }
                    }
                }
                break;
            case "S":
                executarSistema = false;
                break;
            default:
                System.out.println("Digite um comando valido!");
        }
    }


//    public String getUsername() {
//        return benuthe.giovanni.Models.Membros.class.getName();
//    }

//    private Iterator<Object> iterator() {
//    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public Object next() {
        return iterator.next();
    }

    public void remove() {
        iterator.remove();
    }

    public void forEachRemaining(Consumer action) {
        iterator.forEachRemaining(action);
    }


//    @Override
//    public String toString() {
//        String pacote = getClass().getName();
//        String arroba = "@";
//        String codigo = Integer.toHexString(hashCode());
//        if (pacote == "benuthe.giovanni.Models.HeavyLifters"){
//            pacote = "HeavyLifters";
//        }
//        codigo.toString();
//        String stringloca = pacote + ";" + codigo;
//        return stringloca;
//    }


//    @Override
//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }



    /*
    @Override
    public String toString() {
        Iterator<Object> i = iterator();
        if (! i.hasNext()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            Object element = i.next();
            sb.append(e == this ? "(this Collection)" : element);
            if (! i.hasNext()) {
                return sb.append(']').toString();
            }
            sb.append(", ");
        }
    }
*/
}
