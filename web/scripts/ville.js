$(document).ready(function(){
    
    load();
    $('#save').click(function (){
        var nom = $('#nom').val();
        $.ajax({
            url:'VilleController',
            data:{op:'add', nom:nom},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
        
        
    });
    
    $('#container').on('click', '.btn-danger', function (){
        var indice = $(this).attr('indice');
        $.ajax({
            url:'VilleController',
            data:{op:'delete', indice:indice},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
    });
    function load(){
        $.ajax({
            url:'VilleController',
            data:{op:'load'},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
    }
    function remplir(data){
        var container = $('#container');
        var ligne = '';
        for(i = 0; i < data.length; i++){
            ligne+='<tr><td>'+data[i].id+'</td><td>'+data[i].nom+'</td><td><button indice="'+data[i].id+'" class="btn btn-danger">Supprimer</button></td><td><button class="btn btn-danger">Modifier</button></td></tr>';
        }
        container.html(ligne);
    }
});
