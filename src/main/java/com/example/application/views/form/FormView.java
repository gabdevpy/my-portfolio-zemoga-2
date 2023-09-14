package com.example.application.views.form;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;

@PageTitle("Form")
@Route(value = "form", layout = MainLayout.class)
@Uses(Icon.class)
public class FormView extends Composite<VerticalLayout> {

    public FormView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        Avatar avatar = new Avatar();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        H3 h3 = new H3();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        TextField textField = new TextField();
        EmailField emailField = new EmailField();
        VerticalLayout layoutColumn5 = new VerticalLayout();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        VerticalLayout layoutColumn6 = new VerticalLayout();
        Anchor link = new Anchor();
        getContent().setWidthFull();
        getContent().addClassName(Padding.LARGE);
        layoutRow.setWidthFull();
        layoutRow.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth(null);
        avatar.setName("Firstname Lastname");
        layoutRow.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth(null);
        h3.setText("Portfolio Information");
        layoutRow2.setWidthFull();
        layoutRow2.addClassName(Gap.LARGE);
        layoutRow2.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth(null);
        textField.setLabel("Username");
        textField.setWidthFull();
        emailField.setLabel("Email");
        emailField.setWidthFull();
        layoutRow2.setFlexGrow(1.0, layoutColumn5);
        layoutColumn5.setWidth(null);
        textField2.setLabel("Name");
        textField2.setWidthFull();
        textField3.setLabel("Occupation");
        textField3.setWidthFull();
        layoutRow3.addClassName(Gap.MEDIUM);
        buttonPrimary.setText("Save");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancel");
        layoutRow.setFlexGrow(1.0, layoutColumn6);
        layoutColumn6.setWidth(null);
        link.setText("Go Twitter Account");
        link.setHref("#");
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(avatar);
        layoutRow.add(layoutColumn3);
        layoutColumn3.add(h3);
        layoutColumn3.add(layoutRow2);
        layoutRow2.add(layoutColumn4);
        layoutColumn4.add(textField);
        layoutColumn4.add(emailField);
        layoutRow2.add(layoutColumn5);
        layoutColumn5.add(textField2);
        layoutColumn5.add(textField3);
        layoutColumn3.add(layoutRow3);
        layoutRow3.add(buttonPrimary);
        layoutRow3.add(buttonSecondary);
        layoutRow.add(layoutColumn6);
        layoutColumn6.add(link);
    }
}
