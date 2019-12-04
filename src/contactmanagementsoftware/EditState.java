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
        nameField.setEditable(true);
        mobileField.setEditable(true);
        emailField.setEditable(true);
        otherInformationField1.setEditable(true);
        otherInformationField2.setEditable(true);
        otherInformationField3.setEditable(true);

        jButtonConfirmDetails.setText("Save");
        jButtonConfirmDetails.setVisible(true);
        jButtonCancleDetails.setVisible(true);
        
        Acquaintances e = a.get(x).get(num);
        nameField.setText(e.getName());
        mobileField.setText(e.getMobileNo());
        emailField.setText(e.getEmail());
        switch (x) {
            case 0:
                PersonalFriends perF = (PersonalFriends) e;
                otherInformationField1.setText(perF.getEvents());
                otherInformationField2.setText(perF.getAContext());
                otherInformationField3.setText(perF.getADate());
                break;
            case 1:
                Relatives rel = (Relatives) e;
                otherInformationField1.setText(rel.getBDate());
                otherInformationField2.setText(rel.getLDate());
                break;
            case 2:
                ProfessionalFriends proF = (ProfessionalFriends) e;
                otherInformationField1.setText(proF.getCommonInterests());
                break;
            case 3:
                CasualAcquaintances ca = (CasualAcquaintances) e;
                otherInformationField1.setText(ca.getWhenWhere());
                otherInformationField2.setVisible(true);
                otherInformationField3.setVisible(true);
                otherInformationField2.setText(ca.getCircumstances());
                otherInformationField3.setText(ca.getOtherInfo());
                break;
            default:
                break;
        }
        
        switch (x) {
            case 0:
                otherInformationField2.setVisible(true);
                otherInformationField3.setVisible(true);
                jPanelDetailsForm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, op + " Personal Friends Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
                jLabelOtherInformation1.setText("Specific Events:");
                jLabel8OtherInformation2.setText("First Acquaintance Context:");
                jLabelOtherInformation3.setVisible(true);
                jLabelDetailsTableTitle.setVisible(true);
                jLabel8OtherInformation2.setVisible(true);
                jLabelOtherInformation1.setVisible(true);
                jScrollPane5.setVisible(true);
                jScrollPane4.setVisible(true);
                jLabelOtherInformation3.setText("<html>First Acquaintance Date:<br>(dd/mm/yyyy)</html>");
                break;
            case 1:
                jPanelDetailsForm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, op + " Relatives Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
                jLabelOtherInformation1.setText("<html>Relatives Birthday:<br> (dd/mm/yyyy)</html>");
                jLabel8OtherInformation2.setVisible(true);
                jLabelOtherInformation1.setVisible(true);
                otherInformationField2.setVisible(true);
                jLabel8OtherInformation2.setText("<html>Last Date met:<br> (dd/mm/yyyy)</html>");
                jLabelOtherInformation3.setVisible(false);
                otherInformationField3.setVisible(false);
                jScrollPane4.setVisible(true);
                jScrollPane5.setVisible(false);
                break;
            case 2:
                jPanelDetailsForm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, op + " Professional Friends Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
                jLabelOtherInformation1.setText("Common Interests: ");
                jLabelOtherInformation1.setVisible(true);
                jLabel8OtherInformation2.setVisible(false);
                otherInformationField2.setVisible(false);
                jScrollPane4.setVisible(false);
                jLabelOtherInformation3.setVisible(false);
                otherInformationField3.setVisible(false);
                jScrollPane5.setVisible(false);
                break;
            case 3:
                jScrollPane5.setVisible(true);
                jScrollPane4.setVisible(true);
                otherInformationField2.setVisible(true);
                otherInformationField3.setVisible(true);
                jLabelOtherInformation1.setVisible(true);
                jLabel8OtherInformation2.setVisible(true);
                jLabelOtherInformation3.setVisible(true);
                jLabelOtherInformation1.setText("First meeting time & location:");
                jLabel8OtherInformation2.setText("First meeting CIrcumstances:");
                jLabelOtherInformation3.setText("Other useful information:");
                break;
            default:
                break;
        }
    }

}
