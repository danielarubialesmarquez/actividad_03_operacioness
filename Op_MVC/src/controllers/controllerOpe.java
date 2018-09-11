package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelOpe;
import view.viewOpe;
public class controllerOpe implements ActionListener
{
    private final ModelOpe modelOpe;
    private final viewOpe viewOpe;
    public controllerOpe(viewOpe viewOpe, ModelOpe modelOpe)
    {
        this.viewOpe = viewOpe;
        this.modelOpe = modelOpe;
        viewOpe.jb_calculator.addActionListener(this);
        initView();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource()==viewOpe.jb_calculator)
       {
           modelOpe.setOpe("numero ");
           viewOpe.jl_numero1.setText(modelOpe.getMessage());
           viewOpe.jl_numero2.setText(modelOpe.getMessage());
       }
    }
    private void initView() 
    {
        viewOpe.setTitle("Resolviendo operaciones básicas");
        viewOpe.setLocationRelativeTo(null);
        viewOpe.jl_numero1.setText(modelOpe.getMessage());
        viewOpe.jl_numero2.setText(modelOpe.getMessage());
        viewOpe.setVisible(true);
    }
}