$(document).ready(function(){
    var cont = $(".clone_cont");
    var cloned = $(".clone");
    var addButton = $(".addButton");
    var remove = "<input type='button' class='btn btn-info removeMe' name='borrar' value='BORRAR'/>";
    var edit = "<input type='button' class='btn btn-info editMe' name='editar' value='EDITAR'/>";

    //adds a field cloning the first of it's class
    $(addButton).click(function(e){
        e.preventDefault();
        var clone = cloned.clone();
        //resets sonme properties of the original before appending it to the container:
        clone.find("input:text").val('');
        clone.find(".cancelMe").addClass("removeMe").removeClass("cancelMe");
        clone.find(".removeOk").parent().remove();
        clone.find(".removeMe").remove();
        clone.find(":last-child").append(remove);
        clone.find(".editOk").parent().remove();
        clone.find(".editMe").remove();
        clone.find(":last-child").prev().append(edit);
        //appends the clone to the container:
        $(cont).append(clone); 
    });

    //on click removeMe creates two buttons: one to confirm the remove action and another to cancel
    $(cont).on("click", ".removeMe", function(e){
        e.preventDefault();
        var confirm = "<span><input type='button' class='btn btn-info removeOk' name='borrarOk' value='✓'/><input type='button' class='btn btn-info removeNo' name='borrarNo' value='✖'/></span>";
        $(this).parent().append(confirm);
        $(this).remove();
    });


    //on click removeOk confirms the delete
    $(cont).on("click", ".removeOk", function(e){
        e.preventDefault();
        $(this).parent().parent().parent().remove();
    });

    //on click renmoveNo cancels the delete
    $(cont).on("click", ".removeNo", function(e){
        e.preventDefault();
        $(this).parent().parent().append(remove);
        $(this).parent().remove();
    });

    //on click removeMe creates two buttons: one to confirm the edit action and another to cancel
    $(cont).on("click", ".editMe", function(e){
        e.preventDefault();
        var confirm = "<span><input type='button' class='btn btn-info editOk' name='borrarOk' value='✓'/><input type='button' class='btn btn-info editNo' name='borrarNo' value='✖'/></span>";
        $(this).parent().append(confirm);
        $(this).remove();
    });

    //on click editOk confirms the edition
    $(cont).on("click", ".editOk", function(e){
        e.preventDefault();
        $(this).parent().parent().append(edit);
        $(this).parent().remove();
    });

    //on click editNo cancels the edition
    $(cont).on("click", ".editNo", function(e){
        e.preventDefault();
        $(this).parent().parent().append(edit);
        $(this).parent().remove();
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