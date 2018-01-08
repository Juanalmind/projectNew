$(document).ready(function(){
    var cont = $(".clone_cont");
    var cloned = $(".clone");
    var addButton = $(".addButton");

    //adds a field cloning the first of it's class
    $(addButton).click(function(e){
        e.preventDefault();
        var clone = cloned.clone();
        //resets sonme properties of the original before appending it to the container:
        clone.find("input:text").val('');
        clone.find(".cancelMe").addClass("removeMe").removeClass("cancelMe");
        clone.find(".removeMe").val("-");
        clone.find(".editMe").val("EDITAR");
        //appends the clone to the container:
        $(cont).append(clone); 
    });

    //on click removeMe removes the entire field (the parent of its parent, cause this is contained into a td, into a tr)
    $(cont).on("click", ".removeMe", function(e){
        e.preventDefault();
        $(this).parent().parent().remove();
    });

    //on click editMe changes it's own text to "✓" and the field remover button to a cancel button
    $(cont).on("click", ".editMe", function(e){
        e.preventDefault();
        $(this).val("✓");
        $(this).parent().parent().find(".removeMe").val("✖");
        //changing the class it changes the behavior of the button too:
        $(this).parent().parent().find(".removeMe").addClass("cancelMe").removeClass("removeMe");
    });

    //on click cancelMe changes it's own text to "-" and the "✓" button to "EDITAR"
    $(cont).on("click", ".cancelMe", function(e){
        e.preventDefault();
        $(this).val("-");
        $(this).parent().parent().find(".editMe").val("EDITAR");
        //changing the class it changes the behavior of the button too:
        $(this).addClass("removeMe").removeClass("cancelMe");
    });

});