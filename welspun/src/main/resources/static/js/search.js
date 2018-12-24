$(document).ready(function($) {
	
	var table = $('#alpPgmList').DataTable({
		 data:[],
		 "lengthMenu": [ 5, 10, 50, 100 ],
		 columns: [
			 { "mData": "id",
			 "visible":false
			 },
            {
                "mData": "project",
                "mRender": function (data, type, row) {
                    return '<a href="#" data-toggle="modal" data-id=' +row['id']+ ' data-target="#myModal" class="modal-toggle homeHref" data-title="View">' + data + '</a>';
                }
            },
            { "data": "pqrNum" },
            { "data": "baseMetal" },
            { "data": "thickness" },
            { "data": "temp_impactTemp" },
            { "data": "weldReqImpactMin" },
            { "data": "hazReqImpactMin" }
            
            ],
		 rowCallback: function (row, data) {},
		    processing: true,
		    retrieve: true
	 });
	
	 $(document).on('click', '.searchBttn', function(){
		 
		var baseMetal = $("#baseMetal").val();
		var thickness = $("#thickness").val();
		var impactTemp = $("#temp_impactTemp").val();
		var impactweld = $("#weldActualImpact").val();
		var impactHaz = $("#hazReqImpactMin").val();
			
		 $.get( "./search/parameters?baseMetal=" + baseMetal +"&thickness=" + thickness + 
				 "&impactTemp=" +impactTemp+ "&impactweld="+impactweld+
				 "&impactHaz=" +impactHaz, function( data ) 
				 {
			 var r = data;
			 table.clear().draw();
			 table.rows.add(data).draw();
		 });
	 });
	 
	 $(document).on('click', '.modal-toggle', function(){		 
		 $.get( "./alpdetails?id=" + $(this).data('id'), function( data ) {
			 var r = data;
			 $("#modal-body-popup").html(data);
		 });
	    });
	
});