/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

/**
 *
 * @author jiefo
 */
public class EditState extends PanelState {

    public EditState(MUI mui) {
        super(mui);
    }

    @Override
    public void setDescription() {
        mui.getNameField().setEditable(true);
        mui.getMobileField().setEditable(true);
        mui.getEmailField().setEditable(true);
        mui.getOtherInformationField1().setEditable(true);
        mui.getOtherInformationField2().setEditable(true);
        mui.getOtherInformationField3().setEditable(true);

        mui.getJButtonConfirmDetails().setText("Save");
        mui.getJButtonConfirmDetails().setVisible(true);
        mui.getJButtonCancleDetails().setVisible(true);

        Acquaintances e = (Acquaintances) mui.getAc().getAcquaintances(mui.getX()).getAcquaintances(mui.getNum());
        mui.getNameField().setText(e.getName());
        mui.getMobileField().setText(e.getMobileNo());
        mui.getEmailField().setText(e.getEmail());
        switch (mui.getX()) {
            case 0:
                PersonalFriends perF = (PersonalFriends) e;
                mui.getOtherInformationField1().setText(perF.getEvents());
                mui.getOtherInformationField2().setText(perF.getAContext());
                mui.getOtherInformationField3().setText(perF.getADate());
                break;
            case 1:
                Relatives rel = (Relatives) e;
                mui.getOtherInformationField1().setText(rel.getBDate());
                mui.getOtherInformationField2().setText(rel.getLDate());
                break;
            case 2:
                ProfessionalFriends proF = (ProfessionalFriends) e;
                mui.getOtherInformationField1().setText(proF.getCommonInterests());
                break;
            case 3:
                CasualAcquaintances ca = (CasualAcquaintances) e;
                mui.getOtherInformationField1().setText(ca.getWhenWhere());
                mui.getOtherInformationField2().setVisible(true);
                mui.getOtherInformationField3().setVisible(true);
                mui.getOtherInformationField2().setText(ca.getCircumstances());
                mui.getOtherInformationField3().setText(ca.getOtherInfo());
                break;
            default:
                break;
        }

        switch (mui.getX()) {
            case 0:
                mui.getOtherInformationField2().setVisible(true);
                mui.getOtherInformationField3().setVisible(true);
                mui.getJPanelDetailsForm().setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Personal Friends Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
                mui.getJLabelOtherInformation1().setText("Specific Events:");
                mui.getJLabel8OtherInformation2().setText("First Acquaintance Context:");
                mui.getJLabelOtherInformation3().setVisible(true);
                mui.getJLabelDetailsTableTitle().setVisible(true);
                mui.getJLabel8OtherInformation2().setVisible(true);
                mui.getJLabelOtherInformation1().setVisible(true);
                mui.getJScrollPane5().setVisible(true);
                mui.getJScrollPane4().setVisible(true);
                mui.getJLabelOtherInformation3().setText("<html>First Acquaintance Date:<br>(dd/mm/yyyy)</html>");
                break;
            case 1:
                mui.getJPanelDetailsForm().setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Relatives Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
                mui.getJLabelOtherInformation1().setText("<html>Relatives Birthday:<br> (dd/mm/yyyy)</html>");
                mui.getJLabel8OtherInformation2().setVisible(true);
                mui.getJLabelOtherInformation1().setVisible(true);
                mui.getOtherInformationField2().setVisible(true);
                mui.getJLabel8OtherInformation2().setText("<html>Last Date met:<br> (dd/mm/yyyy)</html>");
                mui.getJLabelOtherInformation3().setVisible(false);
                mui.getOtherInformationField3().setVisible(false);
                mui.getJScrollPane4().setVisible(true);
                mui.getJScrollPane5().setVisible(false);
                break;
            case 2:
                mui.getJPanelDetailsForm().setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Professional Friends Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
                mui.getJLabelOtherInformation1().setText("Common Interests: ");
                mui.getJLabelOtherInformation1().setVisible(true);
                mui.getJLabel8OtherInformation2().setVisible(false);
                mui.getOtherInformationField2().setVisible(false);
                mui.getJScrollPane4().setVisible(false);
                mui.getJLabelOtherInformation3().setVisible(false);
                mui.getOtherInformationField3().setVisible(false);
                mui.getJScrollPane5().setVisible(false);
                break;
            case 3:
                mui.getJPanelDetailsForm().setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Casual Acquaintances Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
                mui.getJScrollPane5().setVisible(true);
                mui.getJScrollPane4().setVisible(true);
                mui.getOtherInformationField2().setVisible(true);
                mui.getOtherInformationField3().setVisible(true);
                mui.getJLabelOtherInformation1().setVisible(true);
                mui.getJLabel8OtherInformation2().setVisible(true);
                mui.getJLabelOtherInformation3().setVisible(true);
                mui.getJLabelOtherInformation1().setText("First meeting time & location:");
                mui.getJLabel8OtherInformation2().setText("First meeting CIrcumstances:");
                mui.getJLabelOtherInformation3().setText("Other useful information:");
                break;
            default:
                break;
        }
    }

}
