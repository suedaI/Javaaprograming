package day32_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;
    public ArrayList<Tester> testers=new ArrayList<>();
    public ArrayList<Developer> developers=new ArrayList<>();
    public ScrumTeam(ProductOwner PO,BusinessAnalyst BO,ScrumMaster SM){
        this.PO=PO;
        this.BA=BO;
        this.SM=SM;
    }
    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void removeTester(int id){
        testers.removeIf(p-> p.id==id);

        

        }
    }


