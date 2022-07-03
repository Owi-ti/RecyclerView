package dev.owiti.recyclerviews



class NamesRecyclerViewAdapter(var namesList:List<Strings>):
    RecyclerView.Adapter<NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.name_list_item,parent,false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int){
        holder.tvName.text=nameList.get(position)

    }

    override fun getItemCount(): Int {
        return namesList.size
    }
}



class NamesViewHolder(itemView:View):RecyclerView.ViewHolder(itemView):{
    var tvName=itemView.findViewById<TextView>(R.Id.tvName)

}