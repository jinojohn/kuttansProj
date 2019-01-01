$(document).ready(function($) {
	
	var rows_selected = [];
	
	var table = $('#alpPgmList').DataTable({
		 data:[],
		 "lengthMenu": [ 5, 10, 50, 100 ],
		 columns: [
			 { 
				 "mRender": function (data, type, row) {
					 return '<input type="checkbox" class="custom_checkbox big-checkbox">';
				 }				 
			 },
			 { "mData": "id",
			 "visible":false
			 },
            {
                "mData": "project",
                "mRender": function (data, type, row) {
                    return '<a href="#" data-toggle="modal" data-id=' +row['id']+ ' data-target="#myModal" class="modal-toggle pgm-dtl-btn homeHref" data-title="View">' + data + '</a>';
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
	 
	 $(document).on('click', '.pgm-dtl-btn', function(){		 
		 $.get( "./alpdetails?id=" + $(this).data('id'), function( data ) {
			 var r = data;
			 $("#modal-body-popup").html(data);
		 });
	    });
	 
	 $(document).on('click', '.panel-dtl-title', function(e){
		    var $this = $(this);
			if(!$this.hasClass('panel-collapsed')) {
				$this.parents('.panel').find('.panel-body').slideUp();
				$this.addClass('panel-collapsed');
				$this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
			} else {
				$this.parents('.panel').find('.panel-body').slideDown();
				$this.removeClass('panel-collapsed');
				$this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
			}
		});
	 
/*	 
	 $('#alpPgmList tbody').on('click', 'input[type="checkbox"]', function(e){
		 var $row = $(this).closest('tr');

	      // Get row data
	      var data = table.row($row).data();

	      // Get row ID
	      var rowId = data['id'];
	      var index = $.inArray(rowId, rows_selected);
	      
	   // If checkbox is checked and row ID is not in list of selected row IDs
	      if(this.checked && index === -1){
	         rows_selected.push(rowId);

	      // Otherwise, if checkbox is not checked and row ID is in list of selected row IDs
	      } else if (!this.checked && index !== -1){
	         rows_selected.splice(index, 1);
	      }
	 });*/
	 
	 $(document).on('click', '.compare-btn', function(){
		 var rowcollection = table.$(".custom_checkbox:checked", { "page": "all" });
		 rowcollection.each(function (index, elem) {
		 var checkbox_value = elem.name;
		 var $row = elem.closest('tr');
		 var data = table.row($row).data();
		 // Get row ID
	      var rowId = data['id'];
	      rows_selected.push(rowId);
		 });
		 
		 if(rows_selected && rows_selected.length != 0) {
			 $.get({
				    url : "./compare",
				    traditional: true,
				    data: {'idList': rows_selected },
				    success : function(response) {
				    	$("#comp-modal-body-popup").html(response);
						 rows_selected = [];
				    },
				    error : function(e) {
				       alert('Error while getting the comparison data',e);
						 rows_selected = [];
				    }
				}); 
		 }
		 
	 });
	 
	 
	 $(document).on('click', '.collapseOne', function(){
		 if ($('#1, #2, #3, #4, #5, #6, #7, #8').hasClass("collapse")) {
			 $('#1, #2, #3, #4, #5, #6, #7, #8').removeClass('collapse').addClass('show');
		 }
		 else {
			 $('#1, #2, #3, #4, #5, #6, #7, #8').removeClass('show').addClass('collapse');;
		 }
	 });
	 
	 
	 
});